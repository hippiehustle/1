package z5;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c.u;
import java.util.Objects;

/* renamed from: z5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1872c {

    /* renamed from: a, reason: collision with root package name */
    public OnBackInvokedCallback f16691a;

    public OnBackInvokedCallback a(InterfaceC1871b interfaceC1871b) {
        Objects.requireNonNull(interfaceC1871b);
        return new u(3, interfaceC1871b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(InterfaceC1871b interfaceC1871b, View view, boolean z8) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        int i4;
        if (this.f16691a != null || findOnBackInvokedDispatcher == null) {
            return;
        }
        OnBackInvokedCallback a3 = a(interfaceC1871b);
        this.f16691a = a3;
        if (z8) {
            i4 = 1000000;
        } else {
            i4 = 0;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(i4, a3);
    }

    public void c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f16691a);
            this.f16691a = null;
        }
    }
}
