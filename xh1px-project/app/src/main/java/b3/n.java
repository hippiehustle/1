package b3;

import android.content.ContentResolver;
import android.content.Context;
import b2.r;
import com.buzbuz.smartautoclicker.core.database.ClickDatabase;
import com.buzbuz.smartautoclicker.core.dumb.data.database.DumbDatabase;
import java.io.File;
import o2.C1229a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final DumbDatabase f9175a;

    /* renamed from: b, reason: collision with root package name */
    public final C1229a f9176b;

    /* renamed from: c, reason: collision with root package name */
    public final ClickDatabase f9177c;

    /* renamed from: d, reason: collision with root package name */
    public final r f9178d;

    /* renamed from: e, reason: collision with root package name */
    public final R.g f9179e;

    public n(Context context, DumbDatabase dumbDatabase, C1229a c1229a, ClickDatabase clickDatabase, r rVar) {
        o6.j.e(dumbDatabase, "dumbDatabase");
        o6.j.e(c1229a, "dumbRepository");
        o6.j.e(clickDatabase, "smartDatabase");
        o6.j.e(rVar, "smartRepository");
        this.f9175a = dumbDatabase;
        this.f9176b = c1229a;
        this.f9177c = clickDatabase;
        this.f9178d = rVar;
        File filesDir = context.getFilesDir();
        o6.j.d(filesDir, "getFilesDir(...)");
        ContentResolver contentResolver = context.getContentResolver();
        o6.j.d(contentResolver, "getContentResolver(...)");
        this.f9179e = new R.g(filesDir, contentResolver);
    }
}
