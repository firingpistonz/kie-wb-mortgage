/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mortgages.mortgages;

public class Bankruptcy extends java.lang.Object
		implements
			java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Position(0)
	private java.lang.Integer amountOwed;

	@org.kie.api.definition.type.Position(1)
	private java.lang.Integer yearOfOccurrence;

	private float totalAmount;

	private java.lang.Float totalAmount3;

	private java.lang.Float totalAmount4;

	private java.lang.Float totalAmount5;

	private java.lang.Float totalAmount6;

	public Bankruptcy() {
	}

	public java.lang.Integer getAmountOwed() {
		return this.amountOwed;
	}

	public void setAmountOwed(java.lang.Integer amountOwed) {
		this.amountOwed = amountOwed;
	}

	public java.lang.Integer getYearOfOccurrence() {
		return this.yearOfOccurrence;
	}

	public void setYearOfOccurrence(java.lang.Integer yearOfOccurrence) {
		this.yearOfOccurrence = yearOfOccurrence;
	}

	public float getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public java.lang.Float getTotalAmount3() {
		return this.totalAmount3;
	}

	public void setTotalAmount3(java.lang.Float totalAmount3) {
		this.totalAmount3 = totalAmount3;
	}

	public java.lang.Float getTotalAmount4() {
		return this.totalAmount4;
	}

	public void setTotalAmount4(java.lang.Float totalAmount4) {
		this.totalAmount4 = totalAmount4;
	}

	public java.lang.Float getTotalAmount5() {
		return this.totalAmount5;
	}

	public void setTotalAmount5(java.lang.Float totalAmount5) {
		this.totalAmount5 = totalAmount5;
	}

	public java.lang.Float getTotalAmount6() {
		return this.totalAmount6;
	}

	public void setTotalAmount6(java.lang.Float totalAmount6) {
		this.totalAmount6 = totalAmount6;
	}

	public Bankruptcy(java.lang.Integer amountOwed,
			java.lang.Integer yearOfOccurrence, float totalAmount,
			java.lang.Float totalAmount3, java.lang.Float totalAmount4,
			java.lang.Float totalAmount5, java.lang.Float totalAmount6) {
		this.amountOwed = amountOwed;
		this.yearOfOccurrence = yearOfOccurrence;
		this.totalAmount = totalAmount;
		this.totalAmount3 = totalAmount3;
		this.totalAmount4 = totalAmount4;
		this.totalAmount5 = totalAmount5;
		this.totalAmount6 = totalAmount6;
	}

	public Bankruptcy(java.lang.Integer amountOwed,
			java.lang.Integer yearOfOccurrence) {
		this.amountOwed = amountOwed;
		this.yearOfOccurrence = yearOfOccurrence;
	}
}
