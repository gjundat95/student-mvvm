package com.jundat95.studentmanager.repository;

import com.jundat95.studentmanager.repository.local.model.IssueModel;

import java.util.List;

/**
 * Created by tinhngo on 20/09/2017.
 */

public class ApiRepository {

    private List<IssueModel> issues;
    private Throwable throwable;

    public ApiRepository(List<IssueModel> issues) {
        this.issues = issues;
        this.throwable = null;
    }

    public ApiRepository(Throwable error) {
        this.throwable = error;
        this.issues = null;
    }
}
