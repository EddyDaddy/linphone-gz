package org.linphone.assistant;
import org.linphone.LinphonePreferences;
/*
LoginFragment.java
Copyright (C) 2015  Belledonne Communications, Grenoble, France

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
import org.linphone.R;
import org.linphone.core.LinphoneAddress.TransportType;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
/**
 * @author Sylvain Berfini
 */
public class LoginFragment extends Fragment implements OnClickListener, TextWatcher{
	private EditText login, password, domain;
	private RadioGroup transports;
	private Button apply,logout;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.assistant_login, container, false);
		
		login = (EditText) view.findViewById(R.id.assistant_username);
		login.addTextChangedListener(this);
		password = (EditText) view.findViewById(R.id.assistant_password);
		password.addTextChangedListener(this);
		domain = (EditText) view.findViewById(R.id.assistant_domain);
		domain.addTextChangedListener(this);
		transports = (RadioGroup) view.findViewById(R.id.assistant_transports);
		apply = (Button) view.findViewById(R.id.assistant_apply);
		apply.setEnabled(false);
		apply.setOnClickListener(this);
		logout=(Button) view.findViewById(R.id.assistant_out);
		logout.setOnClickListener(this);
		login.requestFocus();
		login.setBackgroundResource(R.drawable.view_corner7_onfocus_bg);
		setFocusChange();
		return view;
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		
		if (id == R.id.assistant_apply) {
			if (login.getText() == null || login.length() == 0 || password.getText() == null || password.length() == 0 || domain.getText() == null || domain.length() == 0) {
				Toast.makeText(getActivity(), getString(R.string.first_launch_no_login_password), Toast.LENGTH_LONG).show();
				return;
			}

			TransportType transport;
//			if(transports.getCheckedRadioButtonId() == R.id.transport_udp){
//				transport = TransportType.LinphoneTransportUdp;
//			} else {
//				if(transports.getCheckedRadioButtonId() == R.id.transport_tcp){
//					transport = TransportType.LinphoneTransportTcp;
//				} else {
//					transport = TransportType.LinphoneTransportTls;
//				}
//			}
			transport = TransportType.LinphoneTransportUdp;
			String domainStr = "10.21.5.4";
//			domainStr = "222.211.83.186:5080";
//			domainStr = domain.getText().toString();
			AssistantActivity.instance().genericLogIn(login.getText().toString(), password.getText().toString(), null, domainStr, transport);
		}
		if(id==R.id.assistant_out){
			AlertDialog.Builder builder = new Builder(getActivity());
			builder.setMessage("确认退出吗？");
			builder.setTitle("提示");
			builder.setPositiveButton("确定", new DialogInterface.OnClickListener() { // 设置确定按钮
				@Override
				public void onClick(DialogInterface dialog, int which) {
					LinphonePreferences.instance().deleteAccount(0);
//					LinphoneActivity.instance().refreshAccounts();
					dialog.dismiss(); // 关闭dialog
					System.exit(0);
				}
			});
			builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { // 设置取消按钮
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
				}
			});
			builder.create().show();
		}
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		apply.setEnabled(!login.getText().toString().isEmpty() && !password.getText().toString().isEmpty() && !domain.getText().toString().isEmpty());
	}

	@Override
	public void afterTextChanged(Editable s) {

	}
	public void setFocusChange(){
		login.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus){
					login.setBackgroundResource(R.drawable.view_corner7_onfocus_bg);
				}else{
					login.setBackgroundResource(R.drawable.round_corner_5);
				}
			}
		});
		password.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus){
					password.setBackgroundResource(R.drawable.view_corner7_onfocus_bg);
				}else{
					password.setBackgroundResource(R.drawable.round_corner_5);
				}
			}
		});
		domain.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus){
					domain.setBackgroundResource(R.drawable.view_corner7_onfocus_bg);
				}else{
					domain.setBackgroundResource(R.drawable.round_corner_5);
				}
			}
		});
		apply.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus){
					apply.setBackgroundResource(R.drawable.view_corner7_onfocus_bg);
				}else{
					apply.setBackgroundResource(R.drawable.login_btn_bg);
				}
			}
		});
		logout.setOnFocusChangeListener(new OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus){
					logout.setBackgroundResource(R.drawable.view_corner7_onfocus_bg);
				}else{
					logout.setBackgroundResource(R.drawable.logout_btn_bg);
				}
			}
		});
	}
}
