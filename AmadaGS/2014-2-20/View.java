package com.eoe.se2.day13.view;

public class View {

	private String id;
	private String layout_width;
	private String layout_height;
	private String background;
	
	public View() {
		// TODO Auto-generated constructor stub
	}
	
	protected View(String background) {
		//super();
		this.background = background;
	}
	
	
	public View(String id, String layout_width, String layout_height,
			String background) {
		super();
		this.id = id;
		this.layout_width = layout_width;
		this.layout_height = layout_height;
		this.background = background;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLayout_width() {
		return layout_width;
	}

	public void setLayout_width(String layout_width) {
		this.layout_width = layout_width;
	}

	public String getLayout_height() {
		return layout_height;
	}

	public void setLayout_height(String layout_height) {
		this.layout_height = layout_height;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}
	
	private static int getCount(){
		return 4;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "View[id:"+this.id+"  ¸ß¶È:"+
				this.layout_height+"  ¿í¶È:"+
		this.layout_width+"  ±³¾°£º"+background+"]";
	}
	
}
