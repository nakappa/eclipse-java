package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Date Moment;
	public OrderStatus Status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, entities.Client client) {
		Moment = moment;
		Status = status;
		this.client = client;
	}

	public Date getMoment() {
		return Moment;
	}

	public void setMoment(Date moment) {
		Moment = moment;
	}

	public OrderStatus getStatus() {
		return Status;
	}

	public void setStatus(OrderStatus status) {
		Status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItems(OrderItem item) {
		items.add(item);
	}

	public void removeItems(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(Moment) + "\n");
		sb.append("Order status: ");
		sb.append(Status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
