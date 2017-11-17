package com.waylau.spring.boot.fileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.waylau.spring.boot.fileserver.domain.StorageFile;
 

/**
 * File 存储库.
 */
public interface FileRepository extends MongoRepository<StorageFile, String> {
}
