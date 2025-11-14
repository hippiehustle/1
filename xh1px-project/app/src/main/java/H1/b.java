package H1;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import java.util.LinkedHashSet;
import o6.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1882a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f1883b;

    /* renamed from: c, reason: collision with root package name */
    public Point f1884c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f1885d;

    /* renamed from: e, reason: collision with root package name */
    public Point f1886e;

    public b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("OverlayMenuController", 0);
        j.d(sharedPreferences, "getSharedPreferences(...)");
        this.f1882a = sharedPreferences;
        this.f1883b = new LinkedHashSet();
    }
}
