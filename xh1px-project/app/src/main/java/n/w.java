package n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12704a;

    /* renamed from: b, reason: collision with root package name */
    public final m f12705b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12707d;

    /* renamed from: e, reason: collision with root package name */
    public View f12708e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12710g;

    /* renamed from: h, reason: collision with root package name */
    public x f12711h;

    /* renamed from: i, reason: collision with root package name */
    public u f12712i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f, reason: collision with root package name */
    public int f12709f = 8388611;
    public final v k = new v(this);

    public w(Context context, m mVar, View view, boolean z8, int i4, int i8) {
        this.f12704a = context;
        this.f12705b = mVar;
        this.f12708e = view;
        this.f12706c = z8;
        this.f12707d = i4;
    }

    public final u a() {
        u viewOnKeyListenerC1102D;
        if (this.f12712i == null) {
            Context context = this.f12704a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1102D = new ViewOnKeyListenerC1110g(context, this.f12708e, this.f12707d, this.f12706c);
            } else {
                viewOnKeyListenerC1102D = new ViewOnKeyListenerC1102D(this.f12704a, this.f12705b, this.f12708e, this.f12707d, this.f12706c);
            }
            viewOnKeyListenerC1102D.n(this.f12705b);
            viewOnKeyListenerC1102D.t(this.k);
            viewOnKeyListenerC1102D.p(this.f12708e);
            viewOnKeyListenerC1102D.l(this.f12711h);
            viewOnKeyListenerC1102D.q(this.f12710g);
            viewOnKeyListenerC1102D.r(this.f12709f);
            this.f12712i = viewOnKeyListenerC1102D;
        }
        return this.f12712i;
    }

    public final boolean b() {
        u uVar = this.f12712i;
        if (uVar != null && uVar.b()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f12712i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i4, int i8, boolean z8, boolean z9) {
        u a3 = a();
        a3.u(z9);
        if (z8) {
            if ((Gravity.getAbsoluteGravity(this.f12709f, this.f12708e.getLayoutDirection()) & 7) == 5) {
                i4 -= this.f12708e.getWidth();
            }
            a3.s(i4);
            a3.v(i8);
            int i9 = (int) ((this.f12704a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f12702d = new Rect(i4 - i9, i8 - i9, i4 + i9, i8 + i9);
        }
        a3.c();
    }
}
