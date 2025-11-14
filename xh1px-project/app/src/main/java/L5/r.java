package L5;

import P.O;
import a.AbstractC0405a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textfield.TextInputLayout;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C1178a0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f3000A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f3001B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3003b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3004c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f3005d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f3006e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3007f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f3008g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f3009h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f3010i;
    public int j;
    public FrameLayout k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f3011l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3012m;

    /* renamed from: n, reason: collision with root package name */
    public int f3013n;

    /* renamed from: o, reason: collision with root package name */
    public int f3014o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3015p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3016q;

    /* renamed from: r, reason: collision with root package name */
    public C1178a0 f3017r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f3018s;

    /* renamed from: t, reason: collision with root package name */
    public int f3019t;

    /* renamed from: u, reason: collision with root package name */
    public int f3020u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f3021v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f3022w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3023x;

    /* renamed from: y, reason: collision with root package name */
    public C1178a0 f3024y;

    /* renamed from: z, reason: collision with root package name */
    public int f3025z;

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3008g = context;
        this.f3009h = textInputLayout;
        this.f3012m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f3002a = AbstractC0832f.x(context, R.attr.motionDurationShort4, 217);
        this.f3003b = AbstractC0832f.x(context, R.attr.motionDurationMedium4, 167);
        this.f3004c = AbstractC0832f.x(context, R.attr.motionDurationShort4, 167);
        this.f3005d = AbstractC0832f.y(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0710a.f10769d);
        LinearInterpolator linearInterpolator = AbstractC0710a.f10766a;
        this.f3006e = AbstractC0832f.y(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f3007f = AbstractC0832f.y(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C1178a0 c1178a0, int i4) {
        if (this.f3010i == null && this.k == null) {
            Context context = this.f3008g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3010i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3010i;
            TextInputLayout textInputLayout = this.f3009h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.f3010i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i4 != 0 && i4 != 1) {
            this.f3010i.addView(c1178a0, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.k.setVisibility(0);
            this.k.addView(c1178a0);
        }
        this.f3010i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f3010i != null) {
            TextInputLayout textInputLayout = this.f3009h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3008g;
                boolean a02 = AbstractC0405a.a0(context);
                LinearLayout linearLayout = this.f3010i;
                WeakHashMap weakHashMap = O.f4214a;
                int paddingStart = editText.getPaddingStart();
                if (a02) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (a02) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (a02) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f3011l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z8, C1178a0 c1178a0, int i4, int i8, int i9) {
        boolean z9;
        float f8;
        long j;
        TimeInterpolator timeInterpolator;
        if (c1178a0 != null && z8) {
            if (i4 == i9 || i4 == i8) {
                if (i9 == i4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1178a0, (Property<C1178a0, Float>) View.ALPHA, f8);
                int i10 = this.f3004c;
                if (z9) {
                    j = this.f3003b;
                } else {
                    j = i10;
                }
                ofFloat.setDuration(j);
                if (z9) {
                    timeInterpolator = this.f3006e;
                } else {
                    timeInterpolator = this.f3007f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i4 == i9 && i8 != 0) {
                    ofFloat.setStartDelay(i10);
                }
                arrayList.add(ofFloat);
                if (i9 == i4 && i8 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c1178a0, (Property<C1178a0, Float>) View.TRANSLATION_Y, -this.f3012m, 0.0f);
                    ofFloat2.setDuration(this.f3002a);
                    ofFloat2.setInterpolator(this.f3005d);
                    ofFloat2.setStartDelay(i10);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                return null;
            }
            return this.f3024y;
        }
        return this.f3017r;
    }

    public final void f() {
        this.f3015p = null;
        c();
        if (this.f3013n == 1) {
            if (this.f3023x && !TextUtils.isEmpty(this.f3022w)) {
                this.f3014o = 2;
            } else {
                this.f3014o = 0;
            }
        }
        i(this.f3013n, this.f3014o, h(this.f3017r, ""));
    }

    public final void g(C1178a0 c1178a0, int i4) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3010i;
        if (linearLayout != null) {
            if ((i4 == 0 || i4 == 1) && (frameLayout = this.k) != null) {
                frameLayout.removeView(c1178a0);
            } else {
                linearLayout.removeView(c1178a0);
            }
            int i8 = this.j - 1;
            this.j = i8;
            LinearLayout linearLayout2 = this.f3010i;
            if (i8 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(C1178a0 c1178a0, CharSequence charSequence) {
        WeakHashMap weakHashMap = O.f4214a;
        TextInputLayout textInputLayout = this.f3009h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.f3014o != this.f3013n || c1178a0 == null || !TextUtils.equals(c1178a0.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(int i4, int i8, boolean z8) {
        TextView e9;
        TextView e10;
        if (i4 == i8) {
            return;
        }
        if (z8) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3011l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3023x, this.f3024y, 2, i4, i8);
            d(arrayList, this.f3016q, this.f3017r, 1, i4, i8);
            E2.b.E(animatorSet, arrayList);
            animatorSet.addListener(new p(this, i8, e(i4), i4, e(i8)));
            animatorSet.start();
        } else if (i4 != i8) {
            if (i8 != 0 && (e10 = e(i8)) != null) {
                e10.setVisibility(0);
                e10.setAlpha(1.0f);
            }
            if (i4 != 0 && (e9 = e(i4)) != null) {
                e9.setVisibility(4);
                if (i4 == 1) {
                    e9.setText((CharSequence) null);
                }
            }
            this.f3013n = i8;
        }
        TextInputLayout textInputLayout = this.f3009h;
        textInputLayout.r();
        textInputLayout.u(z8, false);
        textInputLayout.x();
    }
}
