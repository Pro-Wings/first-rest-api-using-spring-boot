package com.prowings.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "model candidate")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Candidate {
	@ApiModelProperty(value = "Candidate id")
	@Id
	int roll;
	@Column
	String name;
	@Column
	String address;

}
