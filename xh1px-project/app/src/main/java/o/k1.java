package o;

import android.content.Context;
import android.view.View;
import android.view.Window;
import n.C1104a;

/* loaded from: classes.dex */
public final class k1 implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final C1104a f13298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f13299e;

    /* JADX WARN: Type inference failed for: r0v0, types: [n.a, java.lang.Object] */
    public k1(l1 l1Var) {
        this.f13299e = l1Var;
        Context context = l1Var.f13300a.getContext();
        CharSequence charSequence = l1Var.f13307h;
        ?? obj = new Object();
        obj.f12581e = 4096;
        obj.f12583g = 4096;
        obj.f12586l = null;
        obj.f12587m = null;
        obj.f12588n = false;
        obj.f12589o = false;
        obj.f12590p = 16;
        obj.f12585i = context;
        obj.f12577a = charSequence;
        this.f13298d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l1 l1Var = this.f13299e;
        Window.Callback callback = l1Var.k;
        if (callback != null && l1Var.f13309l) {
            callback.onMenuItemSelected(0, this.f13298d);
        }
    }
}
