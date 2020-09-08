package bean;

import java.io.Serializable;

public class PayContentBean implements Serializable {
    private String orderId;
    private String itemCode;
    private int itemPrice;
    private String productName;
    private String bid;
    private String channelId;
    private String contentId;

    public PayContentBean(String orderId, String itemCode, int itemPrice, String productName, String bid, String channelId, String contentId) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
        this.productName = productName;
        this.bid = bid;
        this.channelId = channelId;
        this.contentId = contentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
}
