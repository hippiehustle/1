package e0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import t7.C1594d;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f10584a;

    /* renamed from: b, reason: collision with root package name */
    public final C1594d f10585b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t7.d] */
    public e(KeyListener keyListener) {
        ?? obj = new Object();
        this.f10584a = keyListener;
        this.f10585b = obj;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i4) {
        this.f10584a.clearMetaKeyState(view, editable, i4);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f10584a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i4, KeyEvent keyEvent) {
        boolean p8;
        boolean z8;
        this.f10585b.getClass();
        if (i4 != 67) {
            if (i4 != 112) {
                p8 = false;
            } else {
                p8 = R.g.p(editable, keyEvent, true);
            }
        } else {
            p8 = R.g.p(editable, keyEvent, false);
        }
        if (p8) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 || this.f10584a.onKeyDown(view, editable, i4, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f10584a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f10584a.onKeyUp(view, editable, i4, keyEvent);
    }
}
