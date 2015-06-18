package cn.aigestudio.datepicker.views;

import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class TwoSelectedMonthView extends MonthView {

	public TwoSelectedMonthView(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public TwoSelectedMonthView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public TwoSelectedMonthView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onScaleAnimationEnd() {
		// TODO Auto-generated method stub
		super.onScaleAnimationEnd();
		List<String> selected = getDateSelected();
		if(selected.size() == 2){
			m_OnDateSelected.selected(selected);
		}
	}
}
