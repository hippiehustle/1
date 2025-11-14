package u0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1618i extends Binder implements InterfaceC1614e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f15237d;

    public BinderC1618i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f15237d = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC1614e.f15225c);
    }

    @Override // u0.InterfaceC1614e
    public final void b(int i4, String[] strArr) {
        o6.j.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f15237d;
        synchronized (multiInstanceInvalidationService.f9005f) {
            String str = (String) multiInstanceInvalidationService.f9004e.get(Integer.valueOf(i4));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f9005f.beginBroadcast();
            for (int i8 = 0; i8 < beginBroadcast; i8++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f9005f.getBroadcastCookie(i8);
                    o6.j.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f9004e.get(num);
                    if (i4 != intValue && str.equals(str2)) {
                        try {
                            ((InterfaceC1613d) multiInstanceInvalidationService.f9005f.getBroadcastItem(i8)).a(strArr);
                        } catch (RemoteException e9) {
                            Log.w("ROOM", "Error invoking a remote callback", e9);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f9005f.finishBroadcast();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [u0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [u0.c, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i8) {
        String str = InterfaceC1614e.f15225c;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC1613d interfaceC1613d = null;
        InterfaceC1613d interfaceC1613d2 = null;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return super.onTransact(i4, parcel, parcel2, i8);
                }
                b(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC1613d.f15224b);
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1613d)) {
                    interfaceC1613d2 = (InterfaceC1613d) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f15223d = readStrongBinder;
                    interfaceC1613d2 = obj;
                }
            }
            int readInt = parcel.readInt();
            o6.j.e(interfaceC1613d2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f15237d;
            synchronized (multiInstanceInvalidationService.f9005f) {
                multiInstanceInvalidationService.f9005f.unregister(interfaceC1613d2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(InterfaceC1613d.f15224b);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC1613d)) {
                interfaceC1613d = (InterfaceC1613d) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.f15223d = readStrongBinder2;
                interfaceC1613d = obj2;
            }
        }
        String readString = parcel.readString();
        o6.j.e(interfaceC1613d, "callback");
        int i9 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f15237d;
            synchronized (multiInstanceInvalidationService2.f9005f) {
                try {
                    int i10 = multiInstanceInvalidationService2.f9003d + 1;
                    multiInstanceInvalidationService2.f9003d = i10;
                    if (multiInstanceInvalidationService2.f9005f.register(interfaceC1613d, Integer.valueOf(i10))) {
                        multiInstanceInvalidationService2.f9004e.put(Integer.valueOf(i10), readString);
                        i9 = i10;
                    } else {
                        multiInstanceInvalidationService2.f9003d--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i9);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
