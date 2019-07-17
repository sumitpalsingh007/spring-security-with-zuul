package com.cogent.modal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Sauravi
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subDepartment")
@ApiModel
public class SubDepartment implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Sub-department id i.e. auto generated by database")
    private Long id;

    @Column(name = "sub_department_name", nullable = false, length = 50)
    @ApiModelProperty(value = "Sub-department name should be unique")
    private String subDepartmentName;

    @Column(name = "code", nullable = false, length = 50)
    @ApiModelProperty(value = "Sub-department Code should be unique")
    private String code;

    @Column(name = "status")
    @ApiModelProperty(value = "Y, N and D are only used")
    private Character status;

    @Column(name = "created_date", nullable = false)
    @ApiModelProperty
    private Date createdDate;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @Column(name = "created_by_id")
    private Long createdById;

    @Column(name = "last_modified_by_id")
    private Long modifiedById;
}
