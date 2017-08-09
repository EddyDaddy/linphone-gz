/*
NumpadView.java
Copyright (C) 2010  Belledonne Communications, Grenoble, France

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package org.linphone.ui;

import java.util.ArrayList;
import java.util.Collection;

import org.linphone.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnKeyListener;
import android.widget.LinearLayout;

/**
 * @author Guillaume Beraudo
 *
 */
public class Numpad extends LinearLayout implements AddressAware {

	private boolean mPlayDtmf;
	private Digit digit1 ;
	public void setPlayDtmf(boolean sendDtmf) {
		this.mPlayDtmf = sendDtmf;
	}

	public Numpad(Context context, boolean playDtmf) {
		super(context);
		mPlayDtmf = playDtmf;
		View view = LayoutInflater.from(context).inflate(R.layout.numpad, this);
		digit1 = (Digit)view.findViewById(R.id.Digit1);
		digit1.setBackgroundResource(R.drawable.numpad_onfocus_bg);
		digit1.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
		setLongClickable(true);
		onFinishInflate();
	}

	public Numpad(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Numpad);
        mPlayDtmf = 1 == a.getInt(org.linphone.R.styleable.Numpad_play_dtmf, 1);
        a.recycle();
        final View view = LayoutInflater.from(context).inflate(R.layout.numpad, this);
		setLongClickable(true);
		final Digit digit1 = (Digit)view.findViewById(R.id.Digit1);
		digit1.requestFocus();
		final Digit digit2 = (Digit)view.findViewById(R.id.Digit2);
		final Digit digit3 = (Digit)view.findViewById(R.id.Digit3);
		final Digit digit4 = (Digit)view.findViewById(R.id.Digit4);
		final Digit digit5 = (Digit)view.findViewById(R.id.Digit5);
		final Digit digit6 = (Digit)view.findViewById(R.id.Digit6);
		final Digit digit7 = (Digit)view.findViewById(R.id.Digit7);
		final Digit digit8 = (Digit)view.findViewById(R.id.Digit8);
		final Digit digit9 = (Digit)view.findViewById(R.id.Digit9);
		final Digit digit00 = (Digit)view.findViewById(R.id.Digit00);
		final Digit digitStar = (Digit)view.findViewById(R.id.DigitStar);
		final Digit digitHash = (Digit)view.findViewById(R.id.DigitHash);
		digit1.setBackgroundResource(R.drawable.numpad_onfocus_bg);
		digit1.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit1.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit2.requestFocus();
//				} else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit4.requestFocus();
//				}
//				return true;
//			}
//		});
		digit2.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit2.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit3.requestFocus();
//				} else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit1.requestFocus();
//				}else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit5.requestFocus();
//				}
//				return true;
//			}
//		});
		digit3.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit3.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit2.requestFocus();
//				}else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit6.requestFocus();
//				}
//				return true;
//			}
//		});
		digit4.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit4.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit5.requestFocus();
//				} else if (keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit1.requestFocus();
//				}else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit7.requestFocus();
//				}
//				return true;
//			}
//		});
		digit5.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit5.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit6.requestFocus();
//				} else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit4.requestFocus();
//				}else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit8.requestFocus();
//				}else if(keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN)
//				{
//					digit2.requestFocus();
//				}
//				return true;
//			}
//		});
		digit6.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit6.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit5.requestFocus();
//				}else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit9.requestFocus();
//				}else if(keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN)
//				{
//					digit3.requestFocus();
//				}
//				return true;
//			}
//		});
		digit7.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit7.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit8.requestFocus();
//				} else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digitStar.requestFocus();
//				}else if(keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN)
//				{
//					digit4.requestFocus();
//				}
//				return true;
//			}
//		});
		digit8.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit8.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit9.requestFocus();
//				} else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit7.requestFocus();
//				}else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit00.requestFocus();
//				}else if(keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN)
//				{
//					digit5.requestFocus();
//				}
//				return true;
//			}
//		});
		digit9.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit9.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit8.requestFocus();
//				}else if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digitHash.requestFocus();
//				}else if(keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN)
//				{
//					digit6.requestFocus();
//				}
//				return true;
//			}
//		});
		digit00.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digit00.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digitHash.requestFocus();
//				} else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digitStar.requestFocus();
//				}else if(keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN)
//				{
//					digit8.requestFocus();
//				}
//				return true;
//			}
//		});
		digitStar.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digitStar.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_RIGHT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit00.requestFocus();
//				} else if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digitStar.requestFocus();
//				}else if(keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN)
//				{
//					digit7.requestFocus();
//				}
//				return true;
//			}
//		});
		digitHash.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus)
				{
					v.setBackgroundResource(R.drawable.numpad_onfocus_bg);
				}
				else
				{
					v.setBackgroundResource(R.drawable.numpad_unfocus_bg);
				}
			}
		});
//		digitHash.setOnKeyListener(new OnKeyListener() {
//
//			@Override
//			public boolean onKey(View v, int keyCode, KeyEvent event) {
//				// TODO Auto-generated method stub
//				if (keyCode == KeyEvent.KEYCODE_DPAD_LEFT
//						&& event.getAction() == KeyEvent.ACTION_DOWN) {
//					digit00.requestFocus();
//				}else if(keyCode == KeyEvent.KEYCODE_DPAD_UP
//						&& event.getAction() == KeyEvent.ACTION_DOWN)
//				{
//					digit9.requestFocus();
//				}
//				return true;
//			}
//		});
	}

	@Override
	protected final void onFinishInflate() {
		for (Digit v : retrieveChildren(this, Digit.class)) {
			v.setPlayDtmf(mPlayDtmf);
		}
		super.onFinishInflate();
	}
	public void setAddressWidget(AddressText address) {
		for (AddressAware v : retrieveChildren(this, AddressAware.class)) {
			v.setAddressWidget(address);
		}
	}


	private final <T> Collection<T> retrieveChildren(ViewGroup viewGroup, Class<T> clazz) {
		final Collection<T> views = new ArrayList<T>();

		for (int i = 0; i < viewGroup.getChildCount(); i++) {
			View v = viewGroup.getChildAt(i);
			if (v instanceof ViewGroup) {
				views.addAll(retrieveChildren((ViewGroup) v, clazz));
			} else {
				if (clazz.isInstance(v))
					views.add(clazz.cast(v));
			}
		}

		return views;
	}
	
	public void setDightOnfocus(){
		digit1.setFocusable(true);
		digit1.requestFocus();
	}

    
}
