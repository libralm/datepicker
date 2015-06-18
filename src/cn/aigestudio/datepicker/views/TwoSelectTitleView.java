package cn.aigestudio.datepicker.views;

import cn.aigestudio.datepicker.interfaces.OnDateSelected;
import android.content.Context;

public class TwoSelectTitleView extends TitleView {

	public TwoSelectTitleView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setOnDateSelected(OnDateSelected onDateSelected,
			MonthView monthView) {
		// TODO Auto-generated method stub
		super.setOnDateSelected(onDateSelected, monthView);
		monthView.setOnDateSelectedListener(onDateSelected);
	}
}
