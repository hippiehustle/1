package C0;

import B0.e;
import B0.f;
import android.os.Bundle;
import androidx.lifecycle.EnumC0504o;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f553a;

    /* renamed from: b, reason: collision with root package name */
    public final e f554b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f557e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f558f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f559g;

    /* renamed from: c, reason: collision with root package name */
    public final G5.e f555c = new G5.e(2);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f556d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f560h = true;

    public b(f fVar, e eVar) {
        this.f553a = fVar;
        this.f554b = eVar;
    }

    public final void a() {
        f fVar = this.f553a;
        if (fVar.g().f8862d == EnumC0504o.f8847e) {
            if (!this.f557e) {
                this.f554b.a();
                fVar.g().a(new a(0, this));
                this.f557e = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
