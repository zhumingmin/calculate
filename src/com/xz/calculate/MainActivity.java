package com.xz.calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button bt_mc, bt_m1, bt_m2, bt_mr, bt_ac, bt_jiajian, bt_chu,
			bt_cheng, bt_jian, bt_jia, bt_9, bt_8, bt_7, bt_6, bt_5, bt_4,
			bt_3, bt_2, bt_1, bt_0, bt_dian, bt_delete, bt_dengyu;
	private TextView tv_a, tv_fangfa, tv_b, tv_dengyuhao, tv_result;
	private String fangfa = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
		delete();
		button();
	}

	private void button() {
		// TODO Auto-generated method stub
		bt_0.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "0");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "0");

				} else {
					tv_b.setText(tv_b.getText().toString() + "0");
				}
			}
		});
		bt_1.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "1");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "1");

				} else {
					tv_b.setText(tv_b.getText().toString() + "1");
				}
			}

		});
		bt_2.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "2");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "2");

				} else {
					tv_b.setText(tv_b.getText().toString() + "2");
				}
			}

		});
		bt_3.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "3");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "3");

				} else {
					tv_b.setText(tv_b.getText().toString() + "3");
				}
			}
		});
		bt_4.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "4");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "4");

				} else {
					tv_b.setText(tv_b.getText().toString() + "4");
				}
			}
		});
		bt_5.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "5");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "5");

				} else {
					tv_b.setText(tv_b.getText().toString() + "5");
				}
			}
		});
		bt_6.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "6");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "6");

				} else {
					tv_b.setText(tv_b.getText().toString() + "6");
				}
			}
		});
		bt_7.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "7");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "7");

				} else {
					tv_b.setText(tv_b.getText().toString() + "7");
				}
			}
		});
		bt_8.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "8");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "8");

				} else {
					tv_b.setText(tv_b.getText().toString() + "8");
				}
			}
		});
		bt_9.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_a.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "9");
				} else if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + "9");

				} else {
					tv_b.setText(tv_b.getText().toString() + "9");
				}
			}
		});
		bt_jia.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv_fangfa.setText("+");
				fangfa = "+";
			}
		});
		bt_jian.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv_fangfa.setText("-");
				fangfa = "-";
			}
		});
		bt_cheng.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv_fangfa.setText("×");
				fangfa = "×";
			}
		});
		bt_chu.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv_fangfa.setText("÷");
				fangfa = "÷";
			}
		});
		bt_dian.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv_fangfa.getText() == "") {
					tv_a.setText(tv_a.getText().toString() + ".");
				} else {
					tv_b.setText(tv_b.getText().toString() + ".");
				}

			}
		});
		bt_dengyu.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv_dengyuhao.setText("=");

				switch (fangfa) {
				case "+": {
					Double a, b, c;

					if (tv_b.getText() != "") {
						a = Double.parseDouble(tv_a.getText().toString());
						b = Double.parseDouble(tv_b.getText().toString());
						c = a + b;
						String d = Double.toString(c);
						tv_result.setText(d);
					} else {
						tv_result.setText("erro");
					}
					break;
				}
				case "-": {
					Double a, b, c;

					if (tv_b.getText() != "") {
						a = Double.parseDouble(tv_a.getText().toString());
						b = Double.parseDouble(tv_b.getText().toString());
						c = a - b;
						String d = Double.toString(c);
						tv_result.setText(d);
					} else {
						tv_result.setText("erro");
					}
					break;
				}
				case "×": {
					Double a, b, c;

					if (tv_b.getText() != "") {
						a = Double.parseDouble(tv_a.getText().toString());
						b = Double.parseDouble(tv_b.getText().toString());
						c = a * b;
						String d = Double.toString(c);
						tv_result.setText(d);
					} else {
						tv_result.setText("erro");
					}
					break;
				}
				case "÷": {
					Double a, b, c;

					if (tv_b.getText().toString() == "0"
							|| tv_b.getText() == "") {
						DisplayToast("除数不可为0");
						tv_result.setText("erro");
					} else {
						a = Double.parseDouble(tv_a.getText().toString());
						b = Double.parseDouble(tv_b.getText().toString());
						c = a / b;
						String d = Double.toString(c);
						tv_result.setText(d);
					}

					break;
				}

				}
			}
		});
	}

	private void delete() {
		// TODO Auto-generated method stub
		bt_delete.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv_a.setText("");
				tv_fangfa.setText("");
				tv_b.setText("");
				tv_dengyuhao.setText("");
				tv_result.setText("");
			}
		});
	}

	private void initView() {
		// TODO Auto-generated method stub
		tv_a = (TextView) findViewById(R.id.tv_a);
		tv_fangfa = (TextView) findViewById(R.id.tv_fangfa);
		tv_b = (TextView) findViewById(R.id.tv_b);
		tv_dengyuhao = (TextView) findViewById(R.id.tv_dengyuhao);
		tv_result = (TextView) findViewById(R.id.tv_result);
		bt_mc = (Button) findViewById(R.id.bt_mc);
		bt_m1 = (Button) findViewById(R.id.bt_m1);
		bt_m2 = (Button) findViewById(R.id.bt_m2);
		bt_mr = (Button) findViewById(R.id.bt_mr);
		bt_ac = (Button) findViewById(R.id.bt_ac);
		bt_jiajian = (Button) findViewById(R.id.bt_jiajian);
		bt_chu = (Button) findViewById(R.id.bt_chu);
		bt_cheng = (Button) findViewById(R.id.bt_cheng);
		bt_jian = (Button) findViewById(R.id.bt_jian);
		bt_jia = (Button) findViewById(R.id.bt_jia);
		bt_9 = (Button) findViewById(R.id.bt_9);
		bt_8 = (Button) findViewById(R.id.bt_8);
		bt_7 = (Button) findViewById(R.id.bt_7);
		bt_6 = (Button) findViewById(R.id.bt_6);
		bt_5 = (Button) findViewById(R.id.bt_5);
		bt_4 = (Button) findViewById(R.id.bt_4);
		bt_3 = (Button) findViewById(R.id.bt_3);
		bt_2 = (Button) findViewById(R.id.bt_2);
		bt_1 = (Button) findViewById(R.id.bt_1);
		bt_0 = (Button) findViewById(R.id.bt_0);
		bt_dian = (Button) findViewById(R.id.bt_dian);
		bt_delete = (Button) findViewById(R.id.bt_delete);
		bt_dengyu = (Button) findViewById(R.id.bt_dengyu);
	}

	private void DisplayToast(String string) {
		// TODO Auto-generated method stub
		Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
	}
}
