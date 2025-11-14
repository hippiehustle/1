package o;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import c.RunnableC0552f;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class S extends G.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13133h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13134i;
    public final /* synthetic */ WeakReference j;
    public final /* synthetic */ W k;

    public S(W w8, int i4, int i8, WeakReference weakReference) {
        this.k = w8;
        this.f13133h = i4;
        this.f13134i = i8;
        this.j = weakReference;
    }

    @Override // G.b
    public final void h(Typeface typeface) {
        int i4;
        boolean z8;
        if (Build.VERSION.SDK_INT >= 28 && (i4 = this.f13133h) != -1) {
            if ((this.f13134i & 2) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            typeface = V.a(typeface, i4, z8);
        }
        W w8 = this.k;
        if (w8.f13146m) {
            w8.f13145l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0552f(textView, typeface, w8.j));
                } else {
                    textView.setTypeface(typeface, w8.j);
                }
            }
        }
    }

    @Override // G.b
    public final void g(int i4) {
    }
}
