package s5;

import E2.d;
import F3.f;
import G5.h;
import M.i;
import P.F;
import P.O;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import h4.AbstractC0832f;
import i.C0865d;
import i.DialogInterfaceC0869h;
import java.util.WeakHashMap;
import m.C1039b;
import x5.p;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: f, reason: collision with root package name */
    public final h f14557f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f14558g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context) {
        super(r6, r15);
        int i4;
        int i8;
        TypedValue E7 = d.E(context, R.attr.materialAlertDialogTheme);
        if (E7 == null) {
            i4 = 0;
        } else {
            i4 = E7.data;
        }
        Context a3 = M5.a.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        a3 = i4 != 0 ? new C1039b(a3, i4) : a3;
        TypedValue E8 = d.E(context, R.attr.materialAlertDialogTheme);
        if (E8 == null) {
            i8 = 0;
        } else {
            i8 = E8.data;
        }
        ContextThemeWrapper contextThemeWrapper = ((C0865d) this.f3288e).f11660a;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        p.a(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = AbstractC0645a.f10648s;
        p.b(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        obtainStyledAttributes.recycle();
        if (contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f14558g = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        int n3 = AbstractC0832f.n(contextThemeWrapper, R.attr.colorSurface, b.class.getCanonicalName());
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = obtainStyledAttributes2.getColor(4, n3);
        obtainStyledAttributes2.recycle();
        h hVar = new h(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        hVar.k(contextThemeWrapper);
        hVar.m(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((C0865d) this.f3288e).f11660a.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                f e9 = hVar.f1769d.f1752a.e();
                e9.c(dimension);
                hVar.setShapeAppearanceModel(e9.a());
            }
        }
        this.f14557f = hVar;
    }

    @Override // M.i
    public final DialogInterfaceC0869h c() {
        DialogInterfaceC0869h c6 = super.c();
        Window window = c6.getWindow();
        View decorView = window.getDecorView();
        h hVar = this.f14557f;
        if (hVar != null) {
            WeakHashMap weakHashMap = O.f4214a;
            hVar.l(F.e(decorView));
        }
        Rect rect = this.f14558g;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) hVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC1505a(c6, rect));
        return c6;
    }

    public final void j(DialogInterface.OnClickListener onClickListener) {
        C0865d c0865d = (C0865d) this.f3288e;
        c0865d.f11668i = c0865d.f11660a.getText(android.R.string.cancel);
        c0865d.j = onClickListener;
    }

    public final void k(int i4, DialogInterface.OnClickListener onClickListener) {
        C0865d c0865d = (C0865d) this.f3288e;
        c0865d.f11666g = c0865d.f11660a.getText(i4);
        c0865d.f11667h = onClickListener;
    }

    public final void l(int i4) {
        C0865d c0865d = (C0865d) this.f3288e;
        c0865d.f11663d = c0865d.f11660a.getText(i4);
    }
}
