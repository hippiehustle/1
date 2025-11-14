package E;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1150d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Context f1151e;

    public v(Context context) {
        this.f1151e = context;
    }

    public final void g(ComponentName componentName) {
        Context context = this.f1151e;
        ArrayList arrayList = this.f1150d;
        int size = arrayList.size();
        try {
            for (Intent a3 = e.a(context, componentName); a3 != null; a3 = e.a(context, a3.getComponent())) {
                arrayList.add(size, a3);
            }
        } catch (PackageManager.NameNotFoundException e9) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e9);
        }
    }

    public final void h() {
        ArrayList arrayList = this.f1150d;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            this.f1151e.startActivities(intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1150d.iterator();
    }
}
