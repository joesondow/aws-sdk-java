/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * Represents a usage charge for Amazon EC2 resources that repeats on a
 * schedule.
 * </p>
 */
public class RecurringCharge {

    /**
     * The frequency of the recurring charge.
     */
    private String frequency;

    /**
     * The amount of the recurring charge.
     */
    private Double amount;

    /**
     * The frequency of the recurring charge.
     *
     * @return The frequency of the recurring charge.
     */
    public String getFrequency() {
        return frequency;
    }
    
    /**
     * The frequency of the recurring charge.
     *
     * @param frequency The frequency of the recurring charge.
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    
    /**
     * The frequency of the recurring charge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param frequency The frequency of the recurring charge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RecurringCharge withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    
    
    /**
     * The amount of the recurring charge.
     *
     * @return The amount of the recurring charge.
     */
    public Double getAmount() {
        return amount;
    }
    
    /**
     * The amount of the recurring charge.
     *
     * @param amount The amount of the recurring charge.
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    /**
     * The amount of the recurring charge.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amount The amount of the recurring charge.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RecurringCharge withAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Frequency: " + frequency + ", ");
        sb.append("Amount: " + amount + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    