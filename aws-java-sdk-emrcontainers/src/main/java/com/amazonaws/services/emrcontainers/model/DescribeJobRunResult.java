/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The output displays information about a job run.
     * </p>
     */
    private JobRun jobRun;

    /**
     * <p>
     * The output displays information about a job run.
     * </p>
     * 
     * @param jobRun
     *        The output displays information about a job run.
     */

    public void setJobRun(JobRun jobRun) {
        this.jobRun = jobRun;
    }

    /**
     * <p>
     * The output displays information about a job run.
     * </p>
     * 
     * @return The output displays information about a job run.
     */

    public JobRun getJobRun() {
        return this.jobRun;
    }

    /**
     * <p>
     * The output displays information about a job run.
     * </p>
     * 
     * @param jobRun
     *        The output displays information about a job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunResult withJobRun(JobRun jobRun) {
        setJobRun(jobRun);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobRun() != null)
            sb.append("JobRun: ").append(getJobRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobRunResult == false)
            return false;
        DescribeJobRunResult other = (DescribeJobRunResult) obj;
        if (other.getJobRun() == null ^ this.getJobRun() == null)
            return false;
        if (other.getJobRun() != null && other.getJobRun().equals(this.getJobRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobRun() == null) ? 0 : getJobRun().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobRunResult clone() {
        try {
            return (DescribeJobRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
