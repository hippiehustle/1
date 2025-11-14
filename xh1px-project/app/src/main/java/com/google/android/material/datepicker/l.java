package com.google.android.material.datepicker;

import P.F;
import P.O;
import P.u0;
import P.w0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.internal.CheckableImageButton;
import e5.AbstractC0645a;
import h4.AbstractC0832f;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import q4.X;
import s5.ViewOnTouchListenerC1505a;

/* loaded from: classes.dex */
public final class l<S> extends g0.r {

    /* renamed from: A0, reason: collision with root package name */
    public boolean f10103A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f10104B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f10105C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f10106D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f10107E0;

    /* renamed from: F0, reason: collision with root package name */
    public CharSequence f10108F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f10109G0;

    /* renamed from: H0, reason: collision with root package name */
    public CharSequence f10110H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f10111I0;

    /* renamed from: J0, reason: collision with root package name */
    public CharSequence f10112J0;

    /* renamed from: K0, reason: collision with root package name */
    public TextView f10113K0;

    /* renamed from: L0, reason: collision with root package name */
    public CheckableImageButton f10114L0;

    /* renamed from: M0, reason: collision with root package name */
    public G5.h f10115M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f10116N0;

    /* renamed from: O0, reason: collision with root package name */
    public CharSequence f10117O0;

    /* renamed from: P0, reason: collision with root package name */
    public CharSequence f10118P0;

    /* renamed from: s0, reason: collision with root package name */
    public final LinkedHashSet f10119s0;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashSet f10120t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f10121u0;

    /* renamed from: v0, reason: collision with root package name */
    public s f10122v0;

    /* renamed from: w0, reason: collision with root package name */
    public b f10123w0;

    /* renamed from: x0, reason: collision with root package name */
    public k f10124x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f10125y0;

    /* renamed from: z0, reason: collision with root package name */
    public CharSequence f10126z0;

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f10119s0 = new LinkedHashSet();
        this.f10120t0 = new LinkedHashSet();
    }

    public static int X(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b4 = v.b();
        b4.set(5, 1);
        Calendar a3 = v.a(b4);
        a3.get(2);
        a3.get(1);
        int maximum = a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean Y(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(E2.d.G(context, R.attr.materialCalendarStyle, k.class.getCanonicalName()).data, new int[]{i4});
        boolean z8 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z8;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void E(Bundle bundle) {
        n nVar;
        n b4;
        super.E(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f10121u0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f10123w0;
        ?? obj = new Object();
        int i4 = a.f10068b;
        int i8 = a.f10068b;
        long j = bVar.f10070d.f10134i;
        long j5 = bVar.f10071e.f10134i;
        obj.f10069a = Long.valueOf(bVar.f10073g.f10134i);
        int i9 = bVar.f10074h;
        d dVar = bVar.f10072f;
        k kVar = this.f10124x0;
        if (kVar == null) {
            nVar = null;
        } else {
            nVar = kVar.f10095f0;
        }
        if (nVar != null) {
            obj.f10069a = Long.valueOf(nVar.f10134i);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        n b9 = n.b(j);
        n b10 = n.b(j5);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l6 = obj.f10069a;
        if (l6 == null) {
            b4 = null;
        } else {
            b4 = n.b(l6.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b9, b10, dVar2, b4, i9));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f10125y0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f10126z0);
        bundle.putInt("INPUT_MODE_KEY", this.f10104B0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f10105C0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f10106D0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10107E0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10108F0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f10109G0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f10110H0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10111I0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10112J0);
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void F() {
        CharSequence charSequence;
        Integer num;
        boolean z8;
        int i4;
        boolean z9;
        X u0Var;
        X u0Var2;
        super.F();
        Window window = U().getWindow();
        if (this.f10103A0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f10115M0);
            if (!this.f10116N0) {
                View findViewById = P().findViewById(R.id.fullscreen_header);
                ColorStateList i8 = h2.a.i(findViewById.getBackground());
                if (i8 != null) {
                    num = Integer.valueOf(i8.getDefaultColor());
                } else {
                    num = null;
                }
                int i9 = Build.VERSION.SDK_INT;
                boolean z10 = false;
                if (num != null && num.intValue() != 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                int m6 = AbstractC0832f.m(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z8) {
                    num = Integer.valueOf(m6);
                }
                E2.d.J(window, false);
                window.getContext();
                Context context = window.getContext();
                if (i9 < 27) {
                    i4 = H.b.e(AbstractC0832f.m(context, android.R.attr.navigationBarColor, -16777216), 128);
                } else {
                    i4 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i4);
                boolean r8 = AbstractC0832f.r(num.intValue());
                if (!AbstractC0832f.r(0) && !r8) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                G5.e eVar = new G5.e(window.getDecorView());
                if (i9 >= 35) {
                    u0Var = new w0(window, eVar);
                } else if (i9 >= 30) {
                    u0Var = new w0(window, eVar);
                } else if (i9 >= 26) {
                    u0Var = new u0(window, eVar);
                } else {
                    u0Var = new u0(window, eVar);
                }
                u0Var.O(z9);
                boolean r9 = AbstractC0832f.r(m6);
                if (AbstractC0832f.r(i4) || (i4 == 0 && r9)) {
                    z10 = true;
                }
                G5.e eVar2 = new G5.e(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 35) {
                    u0Var2 = new w0(window, eVar2);
                } else if (i10 >= 30) {
                    u0Var2 = new w0(window, eVar2);
                } else if (i10 >= 26) {
                    u0Var2 = new u0(window, eVar2);
                } else {
                    u0Var2 = new u0(window, eVar2);
                }
                u0Var2.N(z10);
                A.g gVar = new A.g(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = O.f4214a;
                F.l(findViewById, gVar);
                this.f10116N0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = n().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f10115M0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC1505a(U(), rect));
        }
        O();
        int i11 = this.f10121u0;
        if (i11 != 0) {
            W();
            b bVar = this.f10123w0;
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i11);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f10073g);
            kVar.R(bundle);
            this.f10124x0 = kVar;
            s sVar = kVar;
            if (this.f10104B0 == 1) {
                W();
                b bVar2 = this.f10123w0;
                s mVar = new m();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i11);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                mVar.R(bundle2);
                sVar = mVar;
            }
            this.f10122v0 = sVar;
            TextView textView = this.f10113K0;
            if (this.f10104B0 == 1 && n().getConfiguration().orientation == 2) {
                charSequence = this.f10118P0;
            } else {
                charSequence = this.f10117O0;
            }
            textView.setText(charSequence);
            W();
            throw null;
        }
        W();
        throw null;
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void G() {
        this.f10122v0.f10147c0.clear();
        super.G();
    }

    @Override // g0.r
    public final Dialog T() {
        Context O8 = O();
        O();
        int i4 = this.f10121u0;
        if (i4 != 0) {
            Dialog dialog = new Dialog(O8, i4);
            Context context = dialog.getContext();
            this.f10103A0 = Y(context, android.R.attr.windowFullscreen);
            this.f10115M0 = new G5.h(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0645a.f10652w, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f10115M0.k(context);
            this.f10115M0.m(ColorStateList.valueOf(color));
            G5.h hVar = this.f10115M0;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = O.f4214a;
            hVar.l(F.e(decorView));
            return dialog;
        }
        W();
        throw null;
    }

    public final void W() {
        if (this.f11115i.getParcelable("DATE_SELECTOR_KEY") == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // g0.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f10119s0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // g0.r, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f10120t0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.K;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // g0.r, g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        super.w(bundle);
        if (bundle == null) {
            bundle = this.f11115i;
        }
        this.f10121u0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f10123w0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f10125y0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f10126z0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f10104B0 = bundle.getInt("INPUT_MODE_KEY");
                this.f10105C0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f10106D0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f10107E0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f10108F0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f10109G0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f10110H0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.f10111I0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f10112J0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f10126z0;
                if (charSequence == null) {
                    charSequence = O().getResources().getText(this.f10125y0);
                }
                this.f10117O0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.f10118P0 = charSequence;
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i4;
        String string;
        if (this.f10103A0) {
            i4 = R.layout.mtrl_picker_fullscreen;
        } else {
            i4 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i4, viewGroup);
        Context context = inflate.getContext();
        if (this.f10103A0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(X(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(X(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = O.f4214a;
        textView.setAccessibilityLiveRegion(1);
        this.f10114L0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f10113K0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f10114L0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f10114L0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, h4.g.k(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z8 = false;
        stateListDrawable.addState(new int[0], h4.g.k(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f10114L0;
        if (this.f10104B0 != 0) {
            z8 = true;
        }
        checkableImageButton2.setChecked(z8);
        O.m(this.f10114L0, null);
        CheckableImageButton checkableImageButton3 = this.f10114L0;
        if (this.f10104B0 == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f10114L0.setContentDescription(string);
        this.f10114L0.setOnClickListener(new B2.b(12, this));
        W();
        throw null;
    }
}
