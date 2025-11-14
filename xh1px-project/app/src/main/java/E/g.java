package E;

import P.InterfaceC0262j;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.N;
import androidx.lifecycle.P;

/* loaded from: classes.dex */
public abstract class g extends Activity implements InterfaceC0510v, InterfaceC0262j {

    /* renamed from: d, reason: collision with root package name */
    public final C0512x f1099d = new C0512x(this);

    @Override // P.InterfaceC0262j
    public final boolean c(KeyEvent keyEvent) {
        o6.j.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        o6.j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        o6.j.d(decorView, "window.decorView");
        if (D2.f.j(decorView, keyEvent)) {
            return true;
        }
        return D2.f.k(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        o6.j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        o6.j.d(decorView, "window.decorView");
        if (D2.f.j(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = P.f8802e;
        N.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        o6.j.e(bundle, "outState");
        this.f1099d.g(EnumC0504o.f8848f);
        super.onSaveInstanceState(bundle);
    }
}
