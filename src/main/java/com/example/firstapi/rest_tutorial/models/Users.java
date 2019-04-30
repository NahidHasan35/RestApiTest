package com.example.firstapi.rest_tutorial.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Users {

	@Id
	public ObjectId _id;

	public String name;
	public String subj;
	public String dept;

	// Constructors
	public Users() {}

	public Users(ObjectId _id, String name, String subj, String dept) {
		this._id = _id;
		this.name = name;
		this.subj = subj;
		this.dept = dept;
	}

	public String get_id() { return _id.toHexString(); }
	public void set_id(ObjectId _id) { this._id = _id; }



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubj() {
		return subj;
	}

	public void setSubj(String subj) {
		this.subj = subj;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}