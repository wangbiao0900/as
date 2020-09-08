package bean;

import java.io.Serializable;

public class Bean implements Serializable {

    /**
     * eventType : 2
     * cpContent : {"cpId":"xxx","cpName":"xxx","gameName":"xxx"}
     * payContent : {"orderId":"xxx","itemCode":"xxx","itemPrice":111,"productName":"xxx","bid":"xxx","channelId":"xx","contentId":"xxx"}
     */

    private int eventType;
    private CpContentBean cpContent;
    private PayContentBean payContent;

    public Bean(int eventType, CpContentBean cpContent, PayContentBean payContent) {
        this.eventType = eventType;
        this.cpContent = cpContent;
        this.payContent = payContent;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public CpContentBean getCpContent() {
        return cpContent;
    }

    public void setCpContent(CpContentBean cpContent) {
        this.cpContent = cpContent;
    }

    public PayContentBean getPayContent() {
        return payContent;
    }

    public void setPayContent(PayContentBean payContent) {
        this.payContent = payContent;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "eventType=" + eventType +
                ", cpContent=" + cpContent +
                ", payContent=" + payContent +
                '}';
    }
}
