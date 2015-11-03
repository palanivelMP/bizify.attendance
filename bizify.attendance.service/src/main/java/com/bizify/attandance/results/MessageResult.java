package com.bizify.attandance.results;

import com.bizify.attandance.beans.MessageBean;
import com.bizify.rodin.rest.BaseResult;
import com.bizify.rodin.rest.Messages;

public class MessageResult extends BaseResult<MessageBean> {

    public MessageResult() {
        this(null, null);
    }

    public MessageResult(MessageBean data, Messages messages) {
        this.setData(data);
        this.setMessages(messages);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private MessageBean data;
        private Messages messages;

        public Builder withData(MessageBean data) {
            this.data = data;
            return this;
        }

        public Builder withMessages(Messages messages) {
            this.messages = messages;
            return this;
        }

        public MessageResult build() {
            return new MessageResult(this.data, this.messages);
        }
    }
}
