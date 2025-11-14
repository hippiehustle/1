package B0;

import A.i;
import Z5.j;
import a6.AbstractC0436k;
import android.os.Bundle;
import i.AbstractActivityC0870i;
import java.util.Arrays;
import java.util.LinkedHashSet;
import q4.X;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f414a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f415b;

    public a(i iVar) {
        this.f414a = 0;
        this.f415b = new LinkedHashSet();
        iVar.k("androidx.savedstate.Restarter", this);
    }

    @Override // B0.d
    public final Bundle a() {
        switch (this.f414a) {
            case 0:
                Bundle k = X.k((j[]) Arrays.copyOf(new j[0], 0));
                D2.f.F(k, "classes_to_restore", AbstractC0436k.Q0((LinkedHashSet) this.f415b));
                return k;
            default:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0870i) this.f415b).n().getClass();
                return bundle;
        }
    }

    public a(AbstractActivityC0870i abstractActivityC0870i) {
        this.f414a = 1;
        this.f415b = abstractActivityC0870i;
    }
}
