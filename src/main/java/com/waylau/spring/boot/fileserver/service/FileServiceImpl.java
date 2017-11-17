package com.waylau.spring.boot.fileserver.service;

import com.waylau.spring.boot.fileserver.domain.StorageFile;
import com.waylau.spring.boot.fileserver.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * File 服务.
 * 
 * @since 1.0.0 2017年3月28日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	public FileRepository fileRepository;

	@Override
	public StorageFile saveFile(StorageFile file) {
		return fileRepository.save(file);
	}

	@Override
	public void removeFile(String id) {
		fileRepository.delete(id);
	}

	@Override
	public StorageFile getFileById(String id) {
		return fileRepository.findOne(id);
	}

	@Override
	public List<StorageFile> listFilesByPage(int pageIndex, int pageSize) {
		Page<StorageFile> page = null;
		List<StorageFile> list = null;
		
		Sort sort = new Sort(Direction.DESC,"uploadDate"); 
		Pageable pageable = new PageRequest(pageIndex, pageSize, sort);
		
		page = fileRepository.findAll(pageable);
		list = page.getContent();
		return list;
	}
}
