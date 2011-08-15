package com.yeonsik.test3;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.view.View;

public class OSDSelectionModelTypeBase {
	public static final int BOOK_PDF = 0;
	private static OSDSelectionModelTypeBase instance;
	private static Activity mOSDSettingActivity;
	
	private static  Map<Integer, FontSettingItemVisibleInfo> mapFontSetting = new HashMap<Integer, FontSettingItemVisibleInfo>();
	
	private FontSettingItemVisibleInfo infoFontSetting;
	
	@SuppressWarnings("unused")
	private static OSDSelectionModelTypeBase creationSelectionType(Activity activity) {
		if(activity.getClass().getSimpleName().equals(MainActivity.class.getSimpleName())) {
			instance = new FontSettingSelectionModelType();
		}
		
		mOSDSettingActivity = activity;
		mapFontSetting.clear();
		
		return instance;
	}
	
	protected void setFontSettingMenuItemVisibleInfo(int viewType, boolean fontSize, boolean fontWidth, boolean fontType) {
		infoFontSetting = new FontSettingItemVisibleInfo(fontSize, fontWidth, fontType);
		mapFontSetting.put(viewType, infoFontSetting);
	}
	
	public static void setOSDSelectionModelType(int viewType) {
		// font setting ¿œ∂ß
		if(mOSDSettingActivity.getClass().getSimpleName().equals(MainActivity.class.getSimpleName())) {
			mOSDSettingActivity.findViewById(R.id.title).setVisibility(mapFontSetting.get(viewType).getVisibleFontSize() ? View.VISIBLE : View.GONE);
			mOSDSettingActivity.findViewById(R.id.title).setVisibility(mapFontSetting.get(viewType).getVisibleFontWidth() ? View.VISIBLE : View.GONE);
			mOSDSettingActivity.findViewById(R.id.title).setVisibility(mapFontSetting.get(viewType).getVisibleFontType() ? View.VISIBLE : View.GONE);
		}
		
	}
	
	
}
