package n0;

import O7.Y;
import android.os.Bundle;
import q4.X;
import s3.AbstractC1492c;

/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132j {

    /* renamed from: a, reason: collision with root package name */
    public final Y f12764a;

    public C1132j(C1131i c1131i) {
        o6.j.e(c1131i, "entry");
        this.f12764a = new Y(c1131i, c1131i.f12759e.f12813e.f13342a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [O7.Y, java.lang.Object] */
    public C1132j(Bundle bundle) {
        o6.j.e(bundle, "state");
        bundle.setClassLoader(C1132j.class.getClassLoader());
        o6.j.e(bundle, "state");
        ?? obj = new Object();
        String string = bundle.getString("nav-entry-state:id");
        if (string != null) {
            obj.f4114b = string;
            obj.f4113a = X.y("nav-entry-state:destination-id", bundle);
            Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
            if (bundle2 != null) {
                obj.f4115c = bundle2;
                Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
                if (bundle3 != null) {
                    obj.f4116d = bundle3;
                    this.f12764a = obj;
                    return;
                } else {
                    AbstractC1492c.z("nav-entry-state:saved-state");
                    throw null;
                }
            }
            AbstractC1492c.z("nav-entry-state:args");
            throw null;
        }
        AbstractC1492c.z("nav-entry-state:id");
        throw null;
    }
}
