package J1;

import P.InterfaceC0268p;
import P.t0;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import g0.Y;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Y, InterfaceC0268p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2354e;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f2353d = obj;
        this.f2354e = obj2;
    }

    @Override // g0.Y
    public void a(String str, Bundle bundle) {
        e eVar = (e) this.f2353d;
        a aVar = (a) this.f2354e;
        eVar.f2359b.g(null);
        aVar.m(Boolean.valueOf(bundle.getBoolean(":PermissionDialog:state:isGranted")));
    }

    @Override // P.InterfaceC0268p
    public t0 y(View view, t0 t0Var) {
        int i4;
        int i8;
        int i9;
        Rect rect = (Rect) this.f2353d;
        Rect rect2 = (Rect) this.f2354e;
        j.e(view, "view");
        H.c f8 = t0Var.f4308a.f(647);
        j.d(f8, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = f8.f1851d;
            if (i10 != 0) {
                i4 = rect.bottom + i10;
            } else {
                i4 = rect2.bottom;
            }
            marginLayoutParams.bottomMargin = i4;
            int i11 = f8.f1850c;
            if (i11 != 0) {
                i8 = rect.right + i11;
            } else {
                i8 = rect2.right;
            }
            marginLayoutParams.rightMargin = i8;
            int i12 = f8.f1848a;
            if (i12 != 0) {
                i9 = rect.left + i12;
            } else {
                i9 = rect2.left;
            }
            marginLayoutParams.leftMargin = i9;
            view.setLayoutParams(marginLayoutParams);
            return t0.f4307b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
