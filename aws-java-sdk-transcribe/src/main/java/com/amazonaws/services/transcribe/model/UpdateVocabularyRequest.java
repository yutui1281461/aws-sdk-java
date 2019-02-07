/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabulary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVocabularyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vocabulary to update. The name is case-sensitive.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * An array of strings containing the vocabulary entries.
     * </p>
     */
    private java.util.List<String> phrases;

    /**
     * <p>
     * The name of the vocabulary to update. The name is case-sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary to update. The name is case-sensitive.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to update. The name is case-sensitive.
     * </p>
     * 
     * @return The name of the vocabulary to update. The name is case-sensitive.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to update. The name is case-sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary to update. The name is case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVocabularyRequest withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @return The language code of the vocabulary entries.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public UpdateVocabularyRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public UpdateVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * An array of strings containing the vocabulary entries.
     * </p>
     * 
     * @return An array of strings containing the vocabulary entries.
     */

    public java.util.List<String> getPhrases() {
        return phrases;
    }

    /**
     * <p>
     * An array of strings containing the vocabulary entries.
     * </p>
     * 
     * @param phrases
     *        An array of strings containing the vocabulary entries.
     */

    public void setPhrases(java.util.Collection<String> phrases) {
        if (phrases == null) {
            this.phrases = null;
            return;
        }

        this.phrases = new java.util.ArrayList<String>(phrases);
    }

    /**
     * <p>
     * An array of strings containing the vocabulary entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhrases(java.util.Collection)} or {@link #withPhrases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param phrases
     *        An array of strings containing the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVocabularyRequest withPhrases(String... phrases) {
        if (this.phrases == null) {
            setPhrases(new java.util.ArrayList<String>(phrases.length));
        }
        for (String ele : phrases) {
            this.phrases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings containing the vocabulary entries.
     * </p>
     * 
     * @param phrases
     *        An array of strings containing the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVocabularyRequest withPhrases(java.util.Collection<String> phrases) {
        setPhrases(phrases);
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getPhrases() != null)
            sb.append("Phrases: ").append(getPhrases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVocabularyRequest == false)
            return false;
        UpdateVocabularyRequest other = (UpdateVocabularyRequest) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getPhrases() == null ^ this.getPhrases() == null)
            return false;
        if (other.getPhrases() != null && other.getPhrases().equals(this.getPhrases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getPhrases() == null) ? 0 : getPhrases().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVocabularyRequest clone() {
        return (UpdateVocabularyRequest) super.clone();
    }

}
