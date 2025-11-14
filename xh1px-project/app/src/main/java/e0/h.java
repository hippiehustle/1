package e0;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import o.Z0;

/* loaded from: classes.dex */
public final class h extends c0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10588a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f10589b;

    public h(EditText editText) {
        this.f10589b = new WeakReference(editText);
    }

    @Override // c0.i
    public void a() {
        switch (this.f10588a) {
            case 1:
                Z0 z02 = (Z0) this.f10589b.get();
                if (z02 != null) {
                    z02.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // c0.i
    public final void b() {
        switch (this.f10588a) {
            case 0:
                i.a((EditText) this.f10589b.get(), 1);
                return;
            default:
                Z0 z02 = (Z0) this.f10589b.get();
                if (z02 != null) {
                    z02.c();
                    return;
                }
                return;
        }
    }

    public h(Z0 z02) {
        this.f10589b = new WeakReference(z02);
    }
}
