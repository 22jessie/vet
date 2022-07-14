/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jess.vet.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 *
 * @author jessica-22
 */
@MappedSuperclass
public class BaseEntity {
    
    @CreatedDate
    @Column(updatable=false)
    private LocalDateTime createdAt;
    
    @CreatedBy
    @Column(updatable=false)
    private String createdBy;
    
    @LastModifiedDate
    @Column(insertable=false)
    private LocalDateTime updatedAt;
    
    @LastModifiedBy
    @Column(insertable=false)
    private String updatedBy;
    
}

