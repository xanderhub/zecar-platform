package com.zecar.platform.entities.dto.messages;

import java.util.List;

public final class MessageUsersTuple {
	public MessageDTO message;
	public List<String> users;
	
	public MessageUsersTuple(){}
	
	public MessageUsersTuple(final MessageDTO message, final List<String> users){
		this.message = message;
		this.users = users;
	}
	
	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}
	@Override
	public final boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final MessageUsersTuple other = (MessageUsersTuple) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "MessageUsersTuple [message=" + message + ", users=" + users + "]";
	}
}
