package com.yeonsik.test3;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.GestureDetector.OnGestureListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MyListView extends LinearLayout implements OnGestureListener {
	 private GestureDetector mGestureDetector;
	 private ListView mListView;
	 public MyListView(Context context) {
	     super(context);
	     mGestureDetector = new GestureDetector(this);
	     mGestureDetector.setIsLongpressEnabled(false);
	     mListView = new ListView(context);
	     mListView.setItemsCanFocus(true);
	     String[] items = createStrins();
	     mListView.setAdapter(new ArrayAdapter(context, android.R.layout.simple_list_item_single_choice, items));
	     this.addView(mListView, new LinearLayout.LayoutParams(350, LayoutParams.FILL_PARENT));
	 }
	 
	 @Override
	 public boolean dispatchTouchEvent(MotionEvent ev){
	     mGestureDetector.onTouchEvent(ev);
	     return true;
	 }
	 private String[] createStrins() {
	     return new String[] {
	             "Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance"};
	 }
	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		int scrollWidth = mListView.getWidth() - this.getWidth();
	     if ((this.getScrollX() >= 0) && (this.getScrollX() <= scrollWidth) && (scrollWidth > 0)) {
	         int moveX = (int)distanceX;
	         if (((moveX + this.getScrollX()) >= 0) && ((Math.abs(moveX) + Math.abs(this.getScrollX())) <= scrollWidth)) {
	             this.scrollBy(moveX, 0);
	          }
	         else {
	             if (distanceX >= 0) {
	                 this.scrollBy(scrollWidth - Math.max(Math.abs(moveX), Math.abs(this.getScrollX())), 0);
	             }
	             else {
	                 this.scrollBy(-Math.min(Math.abs(moveX), Math.abs(this.getScrollX())), 0);
	             }
	         }
	     }
	     return true;
	}
	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	}
