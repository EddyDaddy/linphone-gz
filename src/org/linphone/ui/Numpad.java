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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * @author Guillaume Beraudo
 *
 */
public class Numpad extends LinearLayout implements AddressAware {

	private boolean mPlayDtmf;
	public void setPlayDtmf(boolean sendDtmf) {
		this.mPlayDtmf = sendDtmf;
	}

	public Numpad(Context context, boolean playDtmf) {
		super(context);
		mPlayDtmf = playDtmf;
		View view = LayoutInflater.from(context).inflate(R.layout.numpad, this);
		Digit digit1 = (Digit)view.findViewById(R.id.Digit1);
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
        View view = LayoutInflater.from(context).inflate(R.layout.numpad, this);
		setLongClickable(true);
		Digit digit1 = (Digit)view.findViewById(R.id.Digit1);
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
		Digit digit2 = (Digit)view.findViewById(R.id.Digit2);
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
		Digit digit3 = (Digit)view.findViewById(R.id.Digit3);
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
		Digit digit4 = (Digit)view.findViewById(R.id.Digit4);
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
		Digit digit5 = (Digit)view.findViewById(R.id.Digit5);
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
		Digit digit6 = (Digit)view.findViewById(R.id.Digit6);
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
		Digit digit7 = (Digit)view.findViewById(R.id.Digit7);
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
		Digit digit8 = (Digit)view.findViewById(R.id.Digit8);
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
		Digit digit9 = (Digit)view.findViewById(R.id.Digit9);
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
		Digit digit00 = (Digit)view.findViewById(R.id.Digit00);
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
		Digit digitStar = (Digit)view.findViewById(R.id.DigitStar);
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
		Digit digitHash = (Digit)view.findViewById(R.id.DigitHash);
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

}
