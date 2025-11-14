package i;

import android.view.Window;
import o.InterfaceC1192h0;

/* loaded from: classes.dex */
public final class s implements InterfaceC1192h0, n.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0860C f11732d;

    public /* synthetic */ s(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C) {
        this.f11732d = layoutInflaterFactory2C0860C;
    }

    @Override // n.x
    public void a(n.m mVar, boolean z8) {
        boolean z9;
        int i4;
        C0859B c0859b;
        n.m k = mVar.k();
        int i8 = 0;
        if (k != mVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            mVar = k;
        }
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11732d;
        C0859B[] c0859bArr = layoutInflaterFactory2C0860C.f11563O;
        if (c0859bArr != null) {
            i4 = c0859bArr.length;
        } else {
            i4 = 0;
        }
        while (true) {
            if (i8 < i4) {
                c0859b = c0859bArr[i8];
                if (c0859b != null && c0859b.f11540h == mVar) {
                    break;
                } else {
                    i8++;
                }
            } else {
                c0859b = null;
                break;
            }
        }
        if (c0859b != null) {
            if (z9) {
                layoutInflaterFactory2C0860C.o(c0859b.f11533a, c0859b, k);
                layoutInflaterFactory2C0860C.q(c0859b, true);
            } else {
                layoutInflaterFactory2C0860C.q(c0859b, z8);
            }
        }
    }

    @Override // n.x
    public boolean h(n.m mVar) {
        Window.Callback callback;
        if (mVar == mVar.k()) {
            LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11732d;
            if (layoutInflaterFactory2C0860C.f11558I && (callback = layoutInflaterFactory2C0860C.f11585o.getCallback()) != null && !layoutInflaterFactory2C0860C.f11568T) {
                callback.onMenuOpened(108, mVar);
                return true;
            }
            return true;
        }
        return true;
    }
}
