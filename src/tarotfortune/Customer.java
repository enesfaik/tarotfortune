package tarotfortune;

public class Customer {
private String customer_name;
private int customer_age;
private String customer_gender;
private int gem;
private int budget;

public void setGem(int gem) {
	this.gem = gem;
}
public int getGem() {
	return gem;
}
public int getBudget() {
	return budget;
}
public void addmoney(int money) {
	this.budget = budget + money;
}
public void withdrawmoney(int money) {
	if(money<=budget) {
		this.budget = budget - money;
	}
	else {
		System.out.println("Your budget is not enough to withdraw...");
	}
}
public void buygem(int money) {
	if(money<=budget) {
	int a=money/5;
	this.gem =gem+ a;
	this.budget=budget-money;}
	else {
		System.out.println("Please load balance, your balance is not suitable to buy this number of gems.");
	}
}
public Customer(String customer_name, int customer_age, String customer_gender) {

	super();
	this.customer_name = customer_name;
	this.customer_age = customer_age;
	this.customer_gender = customer_gender;
	this.budget=0;
	this.gem=1;
}
public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public int getCustomer_age() {
	return customer_age;
}
public void setCustomer_age(int customer_age) {
	this.customer_age = customer_age;
}
public String getCustomer_gender() {
	return customer_gender;
}
public void setCustomer_gender(String customer_gender) {
	this.customer_gender = customer_gender;
}
@Override
public String toString() {
	return "Customer [customer_name=" + customer_name + ", customer_age=" + customer_age + ", customer_gender="
			+ customer_gender + "]";
}


}
