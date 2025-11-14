package L5;

import P.O;
import a.AbstractC0405a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o.C1178a0;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class n extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f2970d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f2971e;

    /* renamed from: f, reason: collision with root package name */
    public final CheckableImageButton f2972f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2973g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2974h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f2975i;
    public final CheckableImageButton j;
    public final m k;

    /* renamed from: l, reason: collision with root package name */
    public int f2976l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f2977m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f2978n;

    /* renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f2979o;

    /* renamed from: p, reason: collision with root package name */
    public int f2980p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView.ScaleType f2981q;

    /* renamed from: r, reason: collision with root package name */
    public View.OnLongClickListener f2982r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2983s;

    /* renamed from: t, reason: collision with root package name */
    public final C1178a0 f2984t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2985u;

    /* renamed from: v, reason: collision with root package name */
    public EditText f2986v;

    /* renamed from: w, reason: collision with root package name */
    public final AccessibilityManager f2987w;

    /* renamed from: x, reason: collision with root package name */
    public B1.b f2988x;

    /* renamed from: y, reason: collision with root package name */
    public final j f2989y;

    public n(TextInputLayout textInputLayout, R.g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i4 = 0;
        this.f2976l = 0;
        this.f2977m = new LinkedHashSet();
        this.f2989y = new j(this);
        k kVar = new k(this);
        this.f2987w = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2970d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2971e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a3 = a(this, from, R.id.text_input_error_icon);
        this.f2972f = a3;
        CheckableImageButton a4 = a(frameLayout, from, R.id.text_input_end_icon);
        this.j = a4;
        this.k = new m(this, gVar);
        C1178a0 c1178a0 = new C1178a0(getContext(), null);
        this.f2984t = c1178a0;
        TypedArray typedArray = (TypedArray) gVar.f4988f;
        if (typedArray.hasValue(38)) {
            this.f2973g = AbstractC0405a.B(getContext(), gVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f2974h = x5.p.j(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(gVar.A(37));
        }
        a3.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = O.f4214a;
        a3.setImportantForAccessibility(2);
        a3.setClickable(false);
        a3.setPressable(false);
        a3.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f2978n = AbstractC0405a.B(getContext(), gVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f2979o = x5.p.j(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a4.getContentDescription() != (text = typedArray.getText(27))) {
                a4.setContentDescription(text);
            }
            a4.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f2978n = AbstractC0405a.B(getContext(), gVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f2979o = x5.p.j(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a4.getContentDescription() != text2) {
                a4.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f2980p) {
                this.f2980p = dimensionPixelSize;
                a4.setMinimumWidth(dimensionPixelSize);
                a4.setMinimumHeight(dimensionPixelSize);
                a3.setMinimumWidth(dimensionPixelSize);
                a3.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType o7 = AbstractC1638C.o(typedArray.getInt(31, -1));
                this.f2981q = o7;
                a4.setScaleType(o7);
                a3.setScaleType(o7);
            }
            c1178a0.setVisibility(8);
            c1178a0.setId(R.id.textinput_suffix_text);
            c1178a0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            c1178a0.setAccessibilityLiveRegion(1);
            c1178a0.setTextAppearance(typedArray.getResourceId(72, 0));
            if (typedArray.hasValue(73)) {
                c1178a0.setTextColor(gVar.z(73));
            }
            CharSequence text3 = typedArray.getText(71);
            this.f2983s = TextUtils.isEmpty(text3) ? null : text3;
            c1178a0.setText(text3);
            n();
            frameLayout.addView(a4);
            addView(c1178a0);
            addView(frameLayout);
            addView(a3);
            textInputLayout.f10279h0.add(kVar);
            if (textInputLayout.f10276g != null) {
                kVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new l(i4, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i4) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i4);
        if (AbstractC0405a.a0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final o b() {
        o eVar;
        int i4 = this.f2976l;
        m mVar = this.k;
        SparseArray sparseArray = (SparseArray) mVar.f2968c;
        o oVar = (o) sparseArray.get(i4);
        if (oVar == null) {
            n nVar = (n) mVar.f2969d;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                eVar = new i(nVar);
                            } else {
                                throw new IllegalArgumentException(A.j.l("Invalid end icon mode: ", i4));
                            }
                        } else {
                            eVar = new d(nVar);
                        }
                    } else {
                        eVar = new u(nVar, mVar.f2967b);
                    }
                } else {
                    eVar = new e(nVar, 1);
                }
            } else {
                eVar = new e(nVar, 0);
            }
            sparseArray.append(i4, eVar);
            return eVar;
        }
        return oVar;
    }

    public final int c() {
        int marginStart;
        if (!d() && !e()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.j;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = O.f4214a;
        return this.f2984t.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        if (this.f2971e.getVisibility() == 0 && this.j.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f2972f.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z8) {
        boolean z9;
        boolean isActivated;
        boolean z10;
        o b4 = b();
        boolean k = b4.k();
        CheckableImageButton checkableImageButton = this.j;
        boolean z11 = true;
        if (k && (z10 = checkableImageButton.f10173g) != b4.l()) {
            checkableImageButton.setChecked(!z10);
            z9 = true;
        } else {
            z9 = false;
        }
        if ((b4 instanceof i) && (isActivated = checkableImageButton.isActivated()) != b4.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z11 = z9;
        }
        if (!z8 && !z11) {
            return;
        }
        AbstractC1638C.H(this.f2970d, checkableImageButton, this.f2978n);
    }

    public final void g(int i4) {
        boolean z8;
        Drawable drawable;
        if (this.f2976l == i4) {
            return;
        }
        o b4 = b();
        B1.b bVar = this.f2988x;
        AccessibilityManager accessibilityManager = this.f2987w;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new Q.b(bVar));
        }
        CharSequence charSequence = null;
        this.f2988x = null;
        b4.s();
        this.f2976l = i4;
        Iterator it = this.f2977m.iterator();
        if (!it.hasNext()) {
            if (i4 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            h(z8);
            o b9 = b();
            int i8 = this.k.f2966a;
            if (i8 == 0) {
                i8 = b9.d();
            }
            if (i8 != 0) {
                drawable = h4.g.k(getContext(), i8);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.j;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f2970d;
            if (drawable != null) {
                AbstractC1638C.i(textInputLayout, checkableImageButton, this.f2978n, this.f2979o);
                AbstractC1638C.H(textInputLayout, checkableImageButton, this.f2978n);
            }
            int c6 = b9.c();
            if (c6 != 0) {
                charSequence = getResources().getText(c6);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b9.k());
            if (b9.i(textInputLayout.getBoxBackgroundMode())) {
                b9.r();
                B1.b h8 = b9.h();
                this.f2988x = h8;
                if (h8 != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = O.f4214a;
                    if (isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new Q.b(this.f2988x));
                    }
                }
                View.OnClickListener f8 = b9.f();
                View.OnLongClickListener onLongClickListener = this.f2982r;
                checkableImageButton.setOnClickListener(f8);
                AbstractC1638C.K(checkableImageButton, onLongClickListener);
                EditText editText = this.f2986v;
                if (editText != null) {
                    b9.m(editText);
                    j(b9);
                }
                AbstractC1638C.i(textInputLayout, checkableImageButton, this.f2978n, this.f2979o);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i4);
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final void h(boolean z8) {
        int i4;
        if (d() != z8) {
            if (z8) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            this.j.setVisibility(i4);
            k();
            m();
            this.f2970d.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2972f;
        checkableImageButton.setImageDrawable(drawable);
        l();
        AbstractC1638C.i(this.f2970d, checkableImageButton, this.f2973g, this.f2974h);
    }

    public final void j(o oVar) {
        if (this.f2986v != null) {
            if (oVar.e() != null) {
                this.f2986v.setOnFocusChangeListener(oVar.e());
            }
            if (oVar.g() != null) {
                this.j.setOnFocusChangeListener(oVar.g());
            }
        }
    }

    public final void k() {
        int i4;
        boolean z8;
        int i8 = 8;
        if (this.j.getVisibility() == 0 && !e()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.f2971e.setVisibility(i4);
        if (this.f2983s != null && !this.f2985u) {
            z8 = false;
        } else {
            z8 = 8;
        }
        if (d() || e() || !z8) {
            i8 = 0;
        }
        setVisibility(i8);
    }

    public final void l() {
        int i4;
        CheckableImageButton checkableImageButton = this.f2972f;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2970d;
        if (drawable != null && textInputLayout.f10285m.f3016q && textInputLayout.m()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        checkableImageButton.setVisibility(i4);
        k();
        m();
        if (this.f2976l != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i4;
        TextInputLayout textInputLayout = this.f2970d;
        if (textInputLayout.f10276g == null) {
            return;
        }
        if (!d() && !e()) {
            EditText editText = textInputLayout.f10276g;
            WeakHashMap weakHashMap = O.f4214a;
            i4 = editText.getPaddingEnd();
        } else {
            i4 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f10276g.getPaddingTop();
        int paddingBottom = textInputLayout.f10276g.getPaddingBottom();
        WeakHashMap weakHashMap2 = O.f4214a;
        this.f2984t.setPaddingRelative(dimensionPixelSize, paddingTop, i4, paddingBottom);
    }

    public final void n() {
        int i4;
        C1178a0 c1178a0 = this.f2984t;
        int visibility = c1178a0.getVisibility();
        boolean z8 = false;
        if (this.f2983s != null && !this.f2985u) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (visibility != i4) {
            o b4 = b();
            if (i4 == 0) {
                z8 = true;
            }
            b4.p(z8);
        }
        k();
        c1178a0.setVisibility(i4);
        this.f2970d.q();
    }
}
