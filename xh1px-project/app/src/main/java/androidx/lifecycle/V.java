package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class V implements B0.d {

    /* renamed from: a, reason: collision with root package name */
    public final A.i f8812a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8813b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f8814c;

    /* renamed from: d, reason: collision with root package name */
    public final Z5.n f8815d;

    public V(A.i iVar, f0 f0Var) {
        o6.j.e(iVar, "savedStateRegistry");
        this.f8812a = iVar;
        this.f8815d = new Z5.n(new B0.e(16, f0Var));
    }

    @Override // B0.d
    public final Bundle a() {
        Bundle k = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
        Bundle bundle = this.f8814c;
        if (bundle != null) {
            k.putAll(bundle);
        }
        for (Map.Entry entry : ((W) this.f8815d.getValue()).f8816b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a3 = ((g0.F) ((Q) entry.getValue()).f8804a.f299i).a();
            if (!a3.isEmpty()) {
                D2.f.E(k, str, a3);
            }
        }
        this.f8813b = false;
        return k;
    }

    public final void b() {
        if (!this.f8813b) {
            Bundle b4 = this.f8812a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle k = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
            Bundle bundle = this.f8814c;
            if (bundle != null) {
                k.putAll(bundle);
            }
            if (b4 != null) {
                k.putAll(b4);
            }
            this.f8814c = k;
            this.f8813b = true;
        }
    }
}
