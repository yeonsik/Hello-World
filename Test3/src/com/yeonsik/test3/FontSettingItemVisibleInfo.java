package com.yeonsik.test3;

public class FontSettingItemVisibleInfo {
	private boolean mVisibleFontSize;
	private boolean mVisibleFontWidth;
	private boolean mVisibleFontType;
	
	public FontSettingItemVisibleInfo(boolean visibleFontSize,
			boolean visibleFontWidth, boolean visibleFontType) {
		mVisibleFontSize = visibleFontSize;
		mVisibleFontWidth = visibleFontWidth;
		mVisibleFontType = visibleFontType;
	}
	

	public boolean getVisibleFontSize() {
		return mVisibleFontSize;
	}

	public void setVisibleFontSize(boolean visibleFontSize) {
		mVisibleFontSize = visibleFontSize;
	}

	public boolean getVisibleFontWidth() {
		return mVisibleFontWidth;
	}

	public void setVisibleFontWidth(boolean visibleFontWidth) {
		mVisibleFontWidth = visibleFontWidth;
	}

	public boolean getVisibleFontType() {
		return mVisibleFontType;
	}

	public void setVisibleFontType(boolean visibleFontType) {
		mVisibleFontType = visibleFontType;
	}

}
