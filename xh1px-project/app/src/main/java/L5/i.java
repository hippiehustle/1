package L5;

import P.O;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textfield.TextInputLayout;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import java.util.WeakHashMap;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f2950e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2951f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2952g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f2953h;

    /* renamed from: i, reason: collision with root package name */
    public final B2.b f2954i;
    public final ViewOnFocusChangeListenerC0117a j;
    public final B1.b k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2955l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2956m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2957n;

    /* renamed from: o, reason: collision with root package name */
    public long f2958o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2959p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f2960q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f2961r;

    public i(n nVar) {
        super(nVar);
        this.f2954i = new B2.b(9, this);
        this.j = new ViewOnFocusChangeListenerC0117a(this, 1);
        this.k = new B1.b(2, this);
        this.f2958o = Long.MAX_VALUE;
        this.f2951f = AbstractC0832f.x(nVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f2950e = AbstractC0832f.x(nVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f2952g = AbstractC0832f.y(nVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0710a.f10766a);
    }

    @Override // L5.o
    public final void a() {
        if (this.f2959p.isTouchExplorationEnabled() && AbstractC1492c.x(this.f2953h) && !this.f2993d.hasFocus()) {
            this.f2953h.dismissDropDown();
        }
        this.f2953h.post(new E.a(3, this));
    }

    @Override // L5.o
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // L5.o
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // L5.o
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // L5.o
    public final View.OnClickListener f() {
        return this.f2954i;
    }

    @Override // L5.o
    public final B1.b h() {
        return this.k;
    }

    @Override // L5.o
    public final boolean i(int i4) {
        if (i4 != 0) {
            return true;
        }
        return false;
    }

    @Override // L5.o
    public final boolean j() {
        return this.f2955l;
    }

    @Override // L5.o
    public final boolean l() {
        return this.f2957n;
    }

    @Override // L5.o
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f2953h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new E1.b(1, this));
            this.f2953h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: L5.h
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    i iVar = i.this;
                    iVar.f2956m = true;
                    iVar.f2958o = System.currentTimeMillis();
                    iVar.t(false);
                }
            });
            this.f2953h.setThreshold(0);
            TextInputLayout textInputLayout = this.f2990a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!AbstractC1492c.x(editText) && this.f2959p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = O.f4214a;
                this.f2993d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // L5.o
    public final void n(Q.g gVar) {
        boolean e9;
        if (!AbstractC1492c.x(this.f2953h)) {
            gVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            e9 = gVar.f4709a.isShowingHintText();
        } else {
            e9 = gVar.e(4);
        }
        if (e9) {
            gVar.k(null);
        }
    }

    @Override // L5.o
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z8;
        if (this.f2959p.isEnabled() && !AbstractC1492c.x(this.f2953h)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f2957n && !this.f2953h.isPopupShowing()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z8) {
                u();
                this.f2956m = true;
                this.f2958o = System.currentTimeMillis();
            }
        }
    }

    @Override // L5.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2952g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f2951f);
        int i4 = 1;
        ofFloat.addUpdateListener(new I1.a(i4, this));
        this.f2961r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f2950e);
        ofFloat2.addUpdateListener(new I1.a(i4, this));
        this.f2960q = ofFloat2;
        ofFloat2.addListener(new H5.e(4, this));
        this.f2959p = (AccessibilityManager) this.f2992c.getSystemService("accessibility");
    }

    @Override // L5.o
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f2953h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f2953h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z8) {
        if (this.f2957n != z8) {
            this.f2957n = z8;
            this.f2961r.cancel();
            this.f2960q.start();
        }
    }

    public final void u() {
        if (this.f2953h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f2958o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f2956m = false;
        }
        if (!this.f2956m) {
            t(!this.f2957n);
            if (this.f2957n) {
                this.f2953h.requestFocus();
                this.f2953h.showDropDown();
                return;
            } else {
                this.f2953h.dismissDropDown();
                return;
            }
        }
        this.f2956m = false;
    }
}
