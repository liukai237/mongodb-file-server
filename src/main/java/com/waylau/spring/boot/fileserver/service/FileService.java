/**
 *
 */
package com.waylau.spring.boot.fileserver.service;

import com.waylau.spring.boot.fileserver.domain.StorageFile;

import java.util.List;

/**
 * File 服务接口.
 */
public interface FileService {
    /**
     * 保存文件
     *
     * @param file
     * @return
     */
    StorageFile saveFile(StorageFile file);

    /**
     * 删除文件
     *
     * @param id
     * @return
     */
    void removeFile(String id);

    /**
     * 根据id获取文件
     *
     * @param id
     * @return
     */
    StorageFile getFileById(String id);

    /**
     * 分页查询，按上传时间降序
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<StorageFile> listFilesByPage(int pageIndex, int pageSize);
}
