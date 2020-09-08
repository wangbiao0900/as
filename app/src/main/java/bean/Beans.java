package bean;

import java.io.Serializable;

public class Beans implements Serializable {

    /**
     * cpContent : {"cpId":"cx","cpName":"x","gameName":"x"}
     * eventType : 1
     * payContent : {"bid":"b","channelId":"p","contentId":"x","itemCode":"x","itemPrice":0,"orderId":"x","productName":"x"}
     */

    private CpContentBean cpContent;
    private int eventType;
    private PayContentBean payContent;

    public CpContentBean getCpContent() {
        return cpContent;
    }

    public void setCpContent(CpContentBean cpContent) {
        this.cpContent = cpContent;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public PayContentBean getPayContent() {
        return payContent;
    }

    public void setPayContent(PayContentBean payContent) {
        this.payContent = payContent;
    }

    public static class CpContentBean {
        /**
         * cpId : cx
         * cpName : x
         * gameName : x
         */

        private String cpId;
        private String cpName;
        private String gameName;

        public String getCpId() {
            return cpId;
        }

        public void setCpId(String cpId) {
            this.cpId = cpId;
        }

        public String getCpName() {
            return cpName;
        }

        public void setCpName(String cpName) {
            this.cpName = cpName;
        }

        public String getGameName() {
            return gameName;
        }

        public void setGameName(String gameName) {
            this.gameName = gameName;
        }
    }

    public static class PayContentBean {
        /**
         * bid : b
         * channelId : p
         * contentId : x
         * itemCode : x
         * itemPrice : 0
         * orderId : x
         * productName : x
         */

        private String bid;
        private String channelId;
        private String contentId;
        private String itemCode;
        private int itemPrice;
        private String orderId;
        private String productName;

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

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
    }
}
