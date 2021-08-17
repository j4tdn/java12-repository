package builder.status;

public class Status {
	private int like;
	private int comment;
	private int share;
	

	public static Builder builder() {
		return new Builder();
	}
	
	public Status(Builder builder) {
		this.like = builder.like;
		this.comment = builder.comment;
		this.share = builder.share;
	}
	
	public int getLike() {
		return like;
	}



	public void setLike(int like) {
		this.like = like;
	}



	public int getComment() {
		return comment;
	}



	public void setComment(int comment) {
		this.comment = comment;
	}



	public int getShare() {
		return share;
	}



	public void setShare(int share) {
		this.share = share;
	}

	@Override
	public String toString() {
		return "Status [like=" + like + ", comment=" + comment + ", share=" + share + "]";
	}
	
	public static class Builder {
		private int like;
		private int comment;
		private int share;
		
		public Builder like(int like) {
			this.like = like;
			return this;
		}
		
		public Builder comment(int comment) {
			this.comment = comment;
			return this;
		}
		
		public Builder share(int share) {
			this.share = share;
			return this;
		}
		
		public Status build() {
			return new Status(this);
		}
	}
}
