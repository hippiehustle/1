package C6;

import f7.C0725e;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class B extends U {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f711a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f712b;

    public B(ArrayList arrayList) {
        this.f711a = arrayList;
        this.f712b = a6.x.R0(arrayList);
    }

    @Override // C6.U
    public final boolean a(C0725e c0725e) {
        return this.f712b.containsKey(c0725e);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f711a + ')';
    }
}
