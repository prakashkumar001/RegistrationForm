package com.form.registration.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Creative IT Works on 09-Apr-18.
 */

public class PersonalInfo {
    @SerializedName("candidateId")
    public String candidateId;
    @SerializedName("name")
    public String name;
    @SerializedName("father_name")
    public String father_name;
    @SerializedName("mobile_no")
    public String mobile_no;

    @SerializedName("alternate_mobile_no")
    public String alternate_mobile_no;

    public PersonalInfo(String candidateId, String name, String father_name, String mobile_no, String alternate_mobile_no) {
        this.candidateId = candidateId;
        this.name = name;
        this.father_name = father_name;
        this.mobile_no = mobile_no;
        this.alternate_mobile_no = alternate_mobile_no;
    }

}
