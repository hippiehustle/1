package D4;

import O7.V;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;
import i.AbstractC0863b;

/* renamed from: D4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f946b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.c f947c;

    /* renamed from: d, reason: collision with root package name */
    public final P7.n f948d;

    public C0028d(Context context, C4.f fVar) {
        o6.j.e(fVar, "debuggingRepository");
        this.f946b = AbstractC0863b.h(context);
        this.f947c = new A4.c(fVar.f633c, this, context, 4);
        this.f948d = V.u(fVar.f635e, new C0025a(3, (InterfaceC0617c) null));
    }
}
